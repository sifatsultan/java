package retrofit;


import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;

/**
 * Created by Sifat on 2/4/2016.
 */
public class RetrofitPractice {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .build();

        GitHubClient service = retrofit.create(GitHubClient.class);
        Call<List<Repo>> repos = service.listRepos("octocat");
        System.out.println(repos);
    }
}


