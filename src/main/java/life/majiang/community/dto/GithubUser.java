package life.majiang.community.dto;

/**
 * Created by uncle on 2019/10/9.
 */
public class GithubUser {
    private String name;
    private Long id;
    private String bio;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "bio='" + bio + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
