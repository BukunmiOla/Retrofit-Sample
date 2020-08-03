package com.example.retrofit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.retrofit.Model.GetDataService;
import com.example.retrofit.Model.JsonPhAlbums;
import com.example.retrofit.Model.JsonPhComments;
import com.example.retrofit.Model.JsonPhPhotos;
import com.example.retrofit.Model.JsonPhPosts;
import com.example.retrofit.Model.JsonPhTodo;
import com.example.retrofit.Model.users.JsonPhUsers;
import com.example.retrofit.adapter.AlbumAdapter;
import com.example.retrofit.adapter.CommentsAdapter;
import com.example.retrofit.adapter.PhotosAdapter;
import com.example.retrofit.adapter.PostsAdapter;
import com.example.retrofit.adapter.ToDoAdapter;
import com.example.retrofit.adapter.UsersAdapter;
import com.example.retrofit.network.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView customRv;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customRv = findViewById(R.id.customRV);
        progressDialog = new ProgressDialog(MainActivity.this);
        showPhotos();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
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
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<JsonPhPosts>> call = service.getAllPosts();
        call.enqueue(new Callback<List<JsonPhPosts>>() {
            @Override
            public void onResponse(Call<List<JsonPhPosts>> call, Response<List<JsonPhPosts>> response) {
                progressDialog.dismiss();
                generatePostList(response.body());
            }

            @Override
            public void onFailure(Call<List<JsonPhPosts>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generatePostList(List<JsonPhPosts> postList) {
        PostsAdapter adapter = new PostsAdapter(postList);
        customRv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        customRv.setAdapter(adapter);
    }

    private void showComments() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<JsonPhComments>> call = service.getAllComments();
        call.enqueue(new Callback<List<JsonPhComments>>() {
            @Override
            public void onResponse(Call<List<JsonPhComments>> call, Response<List<JsonPhComments>> response) {
                progressDialog.dismiss();
                generateCommentList(response.body());
            }

            @Override
            public void onFailure(Call<List<JsonPhComments>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateCommentList(List<JsonPhComments> commentsList) {
        CommentsAdapter adapter = new CommentsAdapter(commentsList);
        customRv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        customRv.setAdapter(adapter);
    }

    private void showAlbum() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<JsonPhAlbums>> call = service.getAllAlbums();
        call.enqueue(new Callback<List<JsonPhAlbums>>() {
            @Override
            public void onResponse(Call<List<JsonPhAlbums>> call, Response<List<JsonPhAlbums>> response) {
                progressDialog.dismiss();
                generateAlbumList(response.body());
            }

            @Override
            public void onFailure(Call<List<JsonPhAlbums>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateAlbumList(List<JsonPhAlbums> albumList) {
        AlbumAdapter adapter = new AlbumAdapter(albumList);
        customRv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        customRv.setAdapter(adapter);
    }

    private void showPhotos() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<JsonPhPhotos>> call = service.getAllPhotos();
        call.enqueue(new Callback<List<JsonPhPhotos>>() {
            @Override
            public void onResponse(Call<List<JsonPhPhotos>> call, Response<List<JsonPhPhotos>> response) {
                progressDialog.dismiss();
                generatePhotoList(response.body());
            }

            @Override
            public void onFailure(Call<List<JsonPhPhotos>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*Method to generate List of photo using RecyclerView with photo adapter*/
    private void generatePhotoList(List<JsonPhPhotos> photoList ) {
        PhotosAdapter adapter = new PhotosAdapter(this,photoList);
        customRv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        customRv.setAdapter(adapter);

    }

    private void showTodos() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<JsonPhTodo>> call = service.getAllTodo();
        call.enqueue(new Callback<List<JsonPhTodo>>() {
            @Override
            public void onResponse(Call<List<JsonPhTodo>> call, Response<List<JsonPhTodo>> response) {
                progressDialog.dismiss();
                generateTodoList(response.body());
            }

            @Override
            public void onFailure(Call<List<JsonPhTodo>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateTodoList(List<JsonPhTodo> todoList) {
        ToDoAdapter adapter = new ToDoAdapter(todoList);
        customRv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        customRv.setAdapter(adapter);
    }

    private void showUsers() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<JsonPhUsers>> call = service.getAllUsers();
        call.enqueue(new Callback<List<JsonPhUsers>>() {
            @Override
            public void onResponse(Call<List<JsonPhUsers>> call, Response<List<JsonPhUsers>> response) {
                progressDialog.dismiss();
                generateUsersList(response.body());
            }

            @Override
            public void onFailure(Call<List<JsonPhUsers>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateUsersList(List<JsonPhUsers> usersList) {
        UsersAdapter adapter = new UsersAdapter(usersList);
        customRv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        customRv.setAdapter(adapter);
    }


}