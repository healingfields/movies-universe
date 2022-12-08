package ma.showmaker.backend.batch;


import ma.showmaker.backend.entities.Movies;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;


@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    @Autowired
    private ItemReader<Movies> itemReader;
    @Autowired
    private ItemWriter<Movies> itemWriter;
    @Autowired
    private ItemProcessor<Movies,Movies> itemProcessor;



    @Bean
    public Job jobBuild(){
        Step step1 = stepBuilderFactory.get("Read Data")
                .<Movies,Movies>chunk(100)
                .reader(itemReader)
                .writer(itemWriter)
                .processor(itemProcessor)
                .build();
        return jobBuilderFactory.get("Set Data").start(step1).build();
    }

    @Bean
    public FlatFileItemReader<Movies> flatFileItemReader(@Value("${inputFile}") Resource inputFile){
        FlatFileItemReader<Movies> moviesFlatFileItemReader = new FlatFileItemReader<>();
        moviesFlatFileItemReader.setName("FFIR");
        moviesFlatFileItemReader.setLinesToSkip(1);
        moviesFlatFileItemReader.setResource(inputFile);
        moviesFlatFileItemReader.setLineMapper(lineMapper());

        return moviesFlatFileItemReader;
    }

    @Bean
    public LineMapper<Movies> lineMapper() {
        DefaultLineMapper<Movies> defaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames("budget","genres","homePage","originalLanguage","originalTitle","overview","popularity","productionCompanies","productionCountries","releaseDate",
                "revenue","runtime"
                ,"spokenLanguage","status","tagline","title","voteAverage","voteCount");
        defaultLineMapper.setLineTokenizer(lineTokenizer);
        BeanWrapperFieldSetMapper<Movies> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
        beanWrapperFieldSetMapper.setTargetType(Movies.class);
        defaultLineMapper.setFieldSetMapper(beanWrapperFieldSetMapper);
        return defaultLineMapper;
    }
}
