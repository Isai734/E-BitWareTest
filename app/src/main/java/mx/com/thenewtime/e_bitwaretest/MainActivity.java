package mx.com.thenewtime.e_bitwaretest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mx.com.thenewtime.e_bitwaretest.model.pojos.Persona;
import mx.com.thenewtime.e_bitwaretest.view.PersonaFragment;

public class MainActivity extends AppCompatActivity implements PersonaFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            PersonaFragment fragment = new PersonaFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fragment, fragment.getClass().getSimpleName())
                    .commit();
        }
    }

    @Override
    public void onListFragmentInteraction(Persona item) {
        alertMessage(item.toString()).show();
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
                            }
                        });
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
