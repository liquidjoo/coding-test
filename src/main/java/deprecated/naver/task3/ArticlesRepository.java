package deprecated.naver.task3;

public interface ArticlesRepository {

    void save(Article article);

    Article get(Long articleId);

    void remove(Long articleId);

    Article updateLikes(Long articleId, int likes);
}
