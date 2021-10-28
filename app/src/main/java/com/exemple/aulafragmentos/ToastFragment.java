package com.exemple.aulafragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ToastFragment extends Fragment {
    // atributos  da interface
    private TextView txtNome;
    private Button btnOK;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {

        // criação do desenho
        // inflando o desenho
        View view = inflater.inflate( R.layout.fragment_toast, container,
                false );


        // ligando os atributos nos objetos
        txtNome = view.findViewById( R.id.txtNome );
        btnOK = view.findViewById( R.id.btnOK );


        //Criando objeto do escutador do botao OK
        btnOK.setOnClickListener( new EscutadorBotao() );
        return view;
    }
    // classe  do escutador do botão OK
    private class EscutadorBotao implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(getContext(), txtNome.getText().toString(),
                    Toast.LENGTH_SHORT).show();
        }
    }
}