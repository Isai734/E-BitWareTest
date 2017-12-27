/*
 * Copyright (c) 2017. Desarrollado por <a href="https://plus.google.com/u/0/+IsaiCastroAlv">Isai Castro G+</a>
 */

package mx.com.thenewtime.e_bitwaretest.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mx.com.thenewtime.e_bitwaretest.R;
import mx.com.thenewtime.e_bitwaretest.model.pojos.Persona;
import mx.com.thenewtime.e_bitwaretest.view.PersonaFragment.OnListFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Persona} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyPersonaRVAdapter extends RecyclerView.Adapter<MyPersonaRVAdapter.ViewHolder> {

    private List<Persona> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyPersonaRVAdapter(List<Persona> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    public void swapData(List<Persona> items) {
        mValues = items;
        this.notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_persona, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Persona cliente = mValues.get(position);
        holder.mItem = cliente;
        holder.mIdView.setText(cliente.getCliente_ID()+"");
        holder.mNameView.setText(cliente.getNombre() + " " + cliente.getApellidos());
        holder.mEmailView.setText(cliente.getCorreo_Electronico());
        holder.mEdadView.setText("Edad : " + cliente.getEdad());

        holder.mViewEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onListFragmentEdit(holder.mItem);
            }
        });

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues == null ? 0 : mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mNameView;
        public final TextView mEmailView;
        public final TextView mEdadView;
        public final View mViewEdit;
        public Persona mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.c_id);
            mNameView = (TextView) view.findViewById(R.id.c_nombre);
            mEmailView = (TextView) view.findViewById(R.id.c_email);
            mEdadView = (TextView) view.findViewById(R.id.c_edad);
            mViewEdit = (View) view.findViewById(R.id.v_edit);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameView.getText() + "'";
        }
    }
}
