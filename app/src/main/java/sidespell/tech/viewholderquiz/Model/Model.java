package sidespell.tech.viewholderquiz.Model;

/**
 * Created by junvir on 1/14/2016.
 */
public class Model {

    private int poster;
    private String desc;
    private String genre;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Model(int poster, String desc, String genre) {

        this.poster = poster;
        this.desc = desc;
        this.genre = genre;
    }
}
