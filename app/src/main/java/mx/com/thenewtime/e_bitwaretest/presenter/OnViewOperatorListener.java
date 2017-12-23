package mx.com.thenewtime.e_bitwaretest.presenter;



public interface OnViewOperatorListener {

    void onHideProgress();

    void onShowProgress(String message);

    void onRequestError(String error);

    void onRequestOk(String message);

}