package co.myapp.assignement.network;

import co.myapp.assignement.viewModel.DataView;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("https://services.intellify.in/api/attendance?for=All")
    Call<DataView> doGetListAttance();

}
