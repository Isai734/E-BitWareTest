/*
 * Copyright (c) 2017. Desarrollado por <a href="https://plus.google.com/u/0/+IsaiCastroAlv">Isai Castro G+</a>
 */

package mx.com.thenewtime.e_bitwaretest.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.com.thenewtime.e_bitwaretest.R;
import mx.com.thenewtime.e_bitwaretest.model.local.DataSource;
import mx.com.thenewtime.e_bitwaretest.model.pojos.Persona;
import mx.com.thenewtime.e_bitwaretest.model.pojos.ResponseWs;
import mx.com.thenewtime.e_bitwaretest.presenter.ClienteImpOperator;
import mx.com.thenewtime.e_bitwaretest.presenter.OnViewOperatorListener;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class PersonaFragment extends Fragment implements OnViewOperatorListener {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    private static final String TAG = PersonaFragment.class.getSimpleName();
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;
    private MyPersonaRVAdapter rvAdapter;
    private ClienteImpOperator impOperator;


    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PersonaFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static PersonaFragment newInstance(int columnCount) {
        PersonaFragment fragment = new PersonaFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_persona_list, container, false);
        rvAdapter = new MyPersonaRVAdapter(null, mListener);
        impOperator = new ClienteImpOperator(this);
        FloatingActionButton fabAdd = (FloatingActionButton) view.findViewById(R.id.fab_add);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AddActivity.class));
            }
        });
        // Set the adapter

        Context context = view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        if (mColumnCount <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
        }
        recyclerView.setAdapter(rvAdapter);

        impOperator.getAllClientes();
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        rvAdapter.swapData(DataSource.getInstance().getListObject(Persona.class));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onHideProgress() {

    }

    @Override
    public void onShowProgress(String message) {

    }

    @Override
    public void onRequestError(String error) {
        Snackbar.make(getView(), error, Snackbar.LENGTH_LONG).show();
        Log.i(TAG, error);
    }

    @Override
    public void onRequestOk(ResponseWs message) {
        rvAdapter.swapData(DataSource.getInstance().getListObject(Persona.class));
        Snackbar.make(getView(), message.getMensaje(), Snackbar.LENGTH_LONG).show();
        Log.i(TAG, message.getMensaje());
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(Persona item);
        void onListFragmentEdit(Persona item);
    }
}
