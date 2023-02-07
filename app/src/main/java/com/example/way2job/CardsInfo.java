package com.example.way2job;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.way2job.models.Information;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Map;


public class CardsInfo extends AppCompatActivity {
    public static ArrayList<Information> informationArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

//        Intent intent = getIntent();
//        int cardId = Integer.parseInt(intent.getStringExtra("cardId"));

        getDetails(1);


    }



    private void getDetails(int cardId){
        RequestQueue queue = Volley.newRequestQueue(this);

        final String url = "https://way2job.shohos.com/way2jobApis/getCompanyInfo.php?cardId=2";

        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, url, null,

                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Toast.makeText(CardsInfo.this, "inside the functiom" , Toast.LENGTH_SHORT).show();

                        try {
                            JSONArray jsonArray = response.getJSONArray("data");
                            JSONObject jsonObject = (JSONObject) jsonArray.get(0);
                            String id = jsonObject.getString("id");
                            String companyName = jsonObject.getString("companyname");
                            String companyType = jsonObject.getString("companytype");
                            String ctc = jsonObject.getString("ctc");
                            Toast.makeText(CardsInfo.this, "id :" + id + "companyName : " + companyName + " companyType : " + companyType, Toast.LENGTH_SHORT).show();

                        } catch (JSONException e) {
                            System.out.println("::::::::::::::::::::::::::::::::"+e);
                            Toast.makeText(CardsInfo.this, "inside the error" + e , Toast.LENGTH_SHORT).show();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("::::::::::::::::::::::::::::::::"+error);
                Toast.makeText(CardsInfo.this, "inside the error" + error , Toast.LENGTH_SHORT).show();
            }
        }
        ) ;
        queue.add(getRequest);

    }


    public void login(String Email, String Password) {
        RequestQueue queue = Volley.newRequestQueue(this); // this = context

        final String url = "https://auctionapp3.homelyvirtual.com/api/auth/login?emailR="+Email+"&passR="+Password;

// prepare the Request
        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                        Log.d("Response", response.toString());

                        if(response.optString("state").equals("true")){
                            JSONArray jsonObject = response.optJSONArray("data");
                            System.out.println(jsonObject);

                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(CardsInfo.this, "inside the error" + error , Toast.LENGTH_SHORT).show();
                    }
                }
        );
// add it to the RequestQueue
        queue.add(getRequest);
    }


}