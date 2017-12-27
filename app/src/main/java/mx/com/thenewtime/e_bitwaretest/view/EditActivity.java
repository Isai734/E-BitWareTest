/*
 * Copyright (c) 2017. Desarrollado por <a href="https://plus.google.com/u/0/+IsaiCastroAlv">Isai Castro G+</a>
 */

package mx.com.thenewtime.e_bitwaretest.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import mx.com.thenewtime.e_bitwaretest.R;
import mx.com.thenewtime.e_bitwaretest.model.local.DataSource;
import mx.com.thenewtime.e_bitwaretest.model.pojos.Persona;
import mx.com.thenewtime.e_bitwaretest.model.pojos.ResponseWs;
import mx.com.thenewtime.e_bitwaretest.presenter.ClienteImpOperator;
import mx.com.thenewtime.e_bitwaretest.presenter.OnViewOperatorListener;
import mx.com.thenewtime.e_bitwaretest.utils.Constants;

public class EditActivity extends AppCompatActivity implements OnViewOperatorListener {
    private static final String TAG = AddActivity.class.getSimpleName();
    private EditText user;
    private EditText pass;
    private EditText passConfirm;
    private EditText user_name;
    private EditText user_apellidos;
    private EditText userEmail;
    private Button btnSave;
    private ClienteImpOperator impOperator;
    private Persona persona;
    private String TYPE_REQUEST = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.password);
        passConfirm = (EditText) findViewById(R.id.password2);
        user_name = (EditText) findViewById(R.id.user_name);
        user_apellidos = (EditText) findViewById(R.id.user_apellidos);
        userEmail = (EditText) findViewById(R.id.user_email);
        btnSave = (Button) findViewById(R.id.btn_edit);
        impOperator = new ClienteImpOperator(this);
        persona = new Persona();
        setFields(getIntent());

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validateFields())
                    return;
                attempPut();
            }
        });
    }

    public void setFields(Intent data) {
        int userId = data.getIntExtra(Persona.Columnas.CLIENTE_ID, 0);
        String usern = data.getStringExtra(Persona.Columnas.NOMBRE_USUARIO);
        String passw = data.getStringExtra(Persona.Columnas.CONTRASEÑA);
        String name = data.getStringExtra(Persona.Columnas.NOMBRE);
        String apll = (data.getStringExtra(Persona.Columnas.APELLIDOS));
        String email = (data.getStringExtra(Persona.Columnas.CORREO_ELECTRONICO));

        persona.setCliente_ID(userId);
        persona.setNombre_Usuario(usern);
        persona.setContraseña(passw);
        persona.setNombre(name);
        persona.setApellidos(apll);
        persona.setCorreo_Electronico(email);

        user.setText(usern);
        pass.setText(passw);
        passConfirm.setText(passw);
        user_name.setText(name);
        user_apellidos.setText(apll);
        userEmail.setText(email);
    }

    public void attempPut() {
        TYPE_REQUEST = Constants.PUT;
        String usern = user.getText().toString();
        String passw = pass.getText().toString();
        String name = user_name.getText().toString();
        String apll = user_apellidos.getText().toString();
        String email = userEmail.getText().toString();


        persona.setNombre_Usuario(usern);
        persona.setContraseña(passw);
        persona.setNombre(name);
        persona.setApellidos(apll);
        persona.setCorreo_Electronico(email);

        impOperator.putCliente(persona.getCliente_ID() + "", persona);
    }

    public boolean validateFields() {

        if (user.getText().toString().isEmpty()) {
            user.setError("Campo vacio");
            return false;
        }
        if (pass.getText().toString().isEmpty()) {
            pass.setError("Campo vacio");
            return false;
        }
        if (passConfirm.getText().toString().isEmpty()) {
            passConfirm.setError("Campo vacio");
            return false;
        }
        if (user_name.getText().toString().isEmpty()) {
            user_name.setError("Campo vacio");
            return false;
        }
        if (user_apellidos.getText().toString().isEmpty()) {
            user_apellidos.setError("Campo vacio");
            return false;
        }
        if (userEmail.getText().toString().isEmpty()) {
            userEmail.setError("Campo vacio");
            return false;
        }
        if (!pass.getText().toString().equals(passConfirm.getText().toString())) {
            pass.setError("Contraseñas no coinciden");
            return false;
        }
        return true;
    }

    @Override
    public void onHideProgress() {

    }

    @Override
    public void onShowProgress(String message) {

    }


    public void onRequestError(String error) {
        Snackbar.make(getCurrentFocus(), error, Snackbar.LENGTH_LONG).show();
        Log.i(TAG, error);
    }

    @Override
    public void onRequestOk(ResponseWs message) {
        switch (TYPE_REQUEST) {
            case Constants.PUT:
                impOperator.getAllClientes();
                TYPE_REQUEST = Constants.GETS;
                break;
            case Constants.GETS:
                Snackbar.make(getCurrentFocus(), message.getMensaje(), Snackbar.LENGTH_LONG).show();
                Log.i(TAG, message.getMensaje());
                alertMessage("Cliente Agregado Correctamente ID: " + persona.getCliente_ID()).show();
                break;
        }

    }

    public AlertDialog alertMessage(String message) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Mensaje!")
                .setMessage(message)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                finish();
                            }
                        });
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
