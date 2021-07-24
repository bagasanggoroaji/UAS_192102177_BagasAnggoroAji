package com.example.usersapi.services;

import com.example.usersapi.model.GetUser;
import com.example.usersapi.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("api/users")
    Call<GetUser> getUsersList();

//    @FormUrlEncoded
//    @POST("api/users")
//    Call<PostUser> postUser(@Field("name") String name,
//                                     @Field("job") String job);
//    @FormUrlEncoded
//    @PUT("users")
//    Call<PutUser> putUser(@Field("name") String name,
//                                    @Field("job") String job);
//
//    @FormUrlEncoded
//    @HTTP(method = "DELETE", path = "users", hasBody = true)
//    Call<DeleteUser> deleteUser(@Field("id") String id);
}
