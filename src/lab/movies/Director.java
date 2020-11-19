package lab.movies;

public class Director {
    private String name;
    private String birth;
    private  String[] movie;
    private String[] casting;

    public Director() {

    }

    public Director(String name, String birth, String[] movie, String[] casting) {

        this.name = name;
        this.birth = birth;
        this.movie = movie;
        this.casting = casting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String[] getMovie() {
        return movie;
    }

    public void setMovie(String[] movie) {
        this.movie = movie;
    }

    public String[] getCasting() {
        return casting;
    }

    public void setCasting(String[] casting) {
        this.casting = casting;
    }

}
