package com.exemple.aulafragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class SomaFragment extends Fragment {
    // atributos da interface
    private TextView txtValor1;
    private TextView txtValor2;
    private Button btnSoma;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {
        // inflando o layout
        View view = inflater.inflate( R.layout.fragment_soma, container,
                false );
        // ligando os atributos aos objetos
        txtValor1 = view.findViewById( R.id.txtValor1 );
        txtValor2 = view.findViewById( R.id.txtValor2 );
        btnSoma = view.findViewById( R.id.btnSoma );
        //  escutador do botao SOMA
        btnSoma.setOnClickListener( new EscutadorBotao() );
        return view;
    }
    // classe  escutador do botão Soma
    private class EscutadorBotao implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int valor1 = Integer.parseInt( txtValor1.getText().toString()
            );
            int valor2 = Integer.parseInt( txtValor2.getText().toString()
            );
            Toast.makeText(getContext(), Integer.toString(valor1+valor2),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
