package mx.com.thenewtime.e_bitwaretest.presenter;


import mx.com.thenewtime.e_bitwaretest.model.pojos.ResponseWs;

public interface OnViewOperatorListener {

    void onHideProgress();

    void onShowProgress(String message);

    void onRequestError(String error);

    void onRequestOk(ResponseWs message);

}