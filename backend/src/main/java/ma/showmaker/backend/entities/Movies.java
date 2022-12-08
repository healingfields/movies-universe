package ma.showmaker.backend.entities;




import javax.persistence.*;

@Entity
@Table(name = "MOVIES_DATA")
public class Movies {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    @Lob
    private String budget;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String genres;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String homePage;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String originalLanguage;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String originalTitle;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String overview;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String popularity;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String productionCompanies;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String productionCountries;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String releaseDate;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String revenue;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String runtime;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String spokenLanguage;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String status;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String tagline;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String title;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String voteAverage;
    @Column(columnDefinition = "TEXT")
    @Lob
    private String voteCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(String productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public String getProductionCountries() {
        return productionCountries;
    }

    public void setProductionCountries(String productionCountries) {
        this.productionCountries = productionCountries;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSpokenLanguage() {
        return spokenLanguage;
    }

    public void setSpokenLanguage(String spokenLanguage) {
        this.spokenLanguage = spokenLanguage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    public Movies(){}

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public Movies(Long id, String budget, String genres, String homePage, String originalLanguage, String originalTitle, String overview, String popularity, String productionCompanies, String productionCountries, String releaseDate, String revenue, String runtime, String spokenLanguage, String status, String tagline, String title, String voteAverage, String voteCount) {
        this.id = id;
        this.budget = budget;
        this.genres = genres;
        this.homePage = homePage;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.popularity = popularity;
        this.productionCompanies = productionCompanies;
        this.productionCountries = productionCountries;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.runtime = runtime;
        this.spokenLanguage = spokenLanguage;
        this.status = status;
        this.tagline = tagline;
        this.title = title;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }
}
