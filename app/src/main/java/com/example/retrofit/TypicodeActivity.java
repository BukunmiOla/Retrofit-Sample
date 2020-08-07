package com.example.retrofit;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.typicodemodel.GetDataService;
import com.example.retrofit.typicodemodel.TypicodeAlbums;
import com.example.retrofit.typicodemodel.TypicodeComments;
import com.example.retrofit.typicodemodel.TypicodePhotos;
import com.example.retrofit.typicodemodel.TypicodePosts;
import com.example.retrofit.typicodemodel.TypicodeTodo;
import com.example.retrofit.typicodemodel.users.TypicodeUsers;
import com.example.retrofit.typicodeadapter.AlbumAdapter;
import com.example.retrofit.typicodeadapter.CommentsAdapter;
import com.example.retrofit.typicodeadapter.PhotosAdapter;
import com.example.retrofit.typicodeadapter.PostsAdapter;
import com.example.retrofit.typicodeadapter.ToDoAdapter;
import com.example.retrofit.typicodeadapter.UsersAdapter;
import com.example.retrofit.network.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.retrofit.network.RetrofitClientInstance.TYPICODE_COM;

public class TypicodeActivity extends AppCompatActivity {

    RecyclerView customRv;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        customRv = findViewById(R.id.display_rv);
        progressDialog = new ProgressDialog(TypicodeActivity.this);
        showPhotos();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_json_placeholder,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case ((R.id.action_post)):
                showPosts();
                break;
            case ((R.id.action_comments)):
                showComments();
                break;
            case ((R.id.action_album)):
                showAlbum();
                break;
            case ((R.id.action_photos)):
                showPhotos();
                break;
            case ((R.id.action_todos)):
                showTodos();
                break;
            case ((R.id.action_users)):
                showUsers();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showPosts() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getClientInstance(TYPICODE_COM).create(GetDataService.class);
        Call<List<TypicodePosts>> call = service.getAllPosts();
        call.enqueue(new Callback<List<TypicodePosts>>() {
            @Override
            public void onResponse(Call<List<TypicodePosts>> call, Response<List<TypicodePosts>> response) {
                progressDialog.dismiss();
                generatePostList(response.body());
            }

            @Override
            public void onFailure(Call<List<TypicodePosts>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(TypicodeActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generatePostList(List<TypicodePosts> postList) {
        PostsAdapter adapter = new PostsAdapter(postList);
        customRv.setLayoutManager(new LinearLayoutManager(TypicodeActivity.this));
        customRv.setAdapter(adapter);
    }

    private void showComments() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getClientInstance(TYPICODE_COM).create(GetDataService.class);
        Call<List<TypicodeComments>> call = service.getAllComments();
        call.enqueue(new Callback<List<TypicodeComments>>() {
            @Override
            public void onResponse(Call<List<TypicodeComments>> call, Response<List<TypicodeComments>> response) {
                progressDialog.dismiss();
                generateCommentList(response.body());
            }

            @Override
            public void onFailure(Call<List<TypicodeComments>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(TypicodeActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateCommentList(List<TypicodeComments> commentsList) {
        CommentsAdapter adapter = new CommentsAdapter(commentsList);
        customRv.setLayoutManager(new LinearLayoutManager(TypicodeActivity.this));
        customRv.setAdapter(adapter);
    }

    private void showAlbum() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getClientInstance(TYPICODE_COM).create(GetDataService.class);
        Call<List<TypicodeAlbums>> call = service.getAllAlbums();
        call.enqueue(new Callback<List<TypicodeAlbums>>() {
            @Override
            public void onResponse(Call<List<TypicodeAlbums>> call, Response<List<TypicodeAlbums>> response) {
                progressDialog.dismiss();
                generateAlbumList(response.body());
            }

            @Override
            public void onFailure(Call<List<TypicodeAlbums>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(TypicodeActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateAlbumList(List<TypicodeAlbums> albumList) {
        AlbumAdapter adapter = new AlbumAdapter(albumList);
        customRv.setLayoutManager(new LinearLayoutManager(TypicodeActivity.this));
        customRv.setAdapter(adapter);
    }

    private void showPhotos() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getClientInstance(TYPICODE_COM).create(GetDataService.class);
        Call<List<TypicodePhotos>> call = service.getAllPhotos();
        call.enqueue(new Callback<List<TypicodePhotos>>() {
            @Override
            public void onResponse(Call<List<TypicodePhotos>> call, Response<List<TypicodePhotos>> response) {
                progressDialog.dismiss();
                generatePhotoList(response.body());
            }

            @Override
            public void onFailure(Call<List<TypicodePhotos>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(TypicodeActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*Method to generate List of photo using RecyclerView with photo adapter*/
    private void generatePhotoList(List<TypicodePhotos> photoList ) {
        PhotosAdapter adapter = new PhotosAdapter(this,photoList);
        customRv.setLayoutManager(new LinearLayoutManager(TypicodeActivity.this));
        customRv.setAdapter(adapter);

    }

    private void showTodos() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getClientInstance(TYPICODE_COM).create(GetDataService.class);
        Call<List<TypicodeTodo>> call = service.getAllTodo();
        call.enqueue(new Callback<List<TypicodeTodo>>() {
            @Override
            public void onResponse(Call<List<TypicodeTodo>> call, Response<List<TypicodeTodo>> response) {
                progressDialog.dismiss();
                generateTodoList(response.body());
            }

            @Override
            public void onFailure(Call<List<TypicodeTodo>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(TypicodeActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateTodoList(List<TypicodeTodo> todoList) {
        ToDoAdapter adapter = new ToDoAdapter(todoList);
        customRv.setLayoutManager(new LinearLayoutManager(TypicodeActivity.this));
        customRv.setAdapter(adapter);
    }

    private void showUsers() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getClientInstance(TYPICODE_COM).create(GetDataService.class);
        Call<List<TypicodeUsers>> call = service.getAllUsers();
        call.enqueue(new Callback<List<TypicodeUsers>>() {
            @Override
            public void onResponse(Call<List<TypicodeUsers>> call, Response<List<TypicodeUsers>> response) {
                progressDialog.dismiss();
                generateUsersList(response.body());
            }

            @Override
            public void onFailure(Call<List<TypicodeUsers>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(TypicodeActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateUsersList(List<TypicodeUsers> usersList) {
        UsersAdapter adapter = new UsersAdapter(usersList);
        customRv.setLayoutManager(new LinearLayoutManager(TypicodeActivity.this));
        customRv.setAdapter(adapter);
    }


}