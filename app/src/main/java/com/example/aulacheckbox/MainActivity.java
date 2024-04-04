package com.example.aulacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxGreen;
    private CheckBox checkBoxBlue;
    private CheckBox checkBoxRed;
    private TextView textResult;

    private RadioButton radioButtonFemenino, radioButtonMasculino, radioButtonNaoDefinido;
    private RadioGroup radioGroupSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxGreen = findViewById(R.id.checkBoxGreen);
        checkBoxBlue = findViewById(R.id.checkBoxBlue);
        checkBoxRed = findViewById(R.id.checkBoxRed);
        textResult = findViewById(R.id.textResult);

        radioButtonFemenino = findViewById(R.id.radioButtonFeminino);
        radioButtonMasculino = findViewById(R.id.radioButtonMasculino);
        radioButtonNaoDefinido = findViewById(R.id.radioButtonSexoNaoInformado);
        radioGroupSexo = findViewById(R.id.radioGroupSexo);

        radiobuttonListener();
    }
    public void enviar(View view){
        checkBox();
        //radiobutton();
    }

    public void radiobutton(){
        if(radioButtonFemenino.isChecked()){
            textResult.setText("Feminino");
        }else if(radioButtonMasculino.isChecked()){
            textResult.setText("Masculino");
        } else if (radioButtonNaoDefinido.isChecked()) {

            textResult.setText("Sexo não definifo");
        }


    }
    public void radiobuttonListener() {
        radioGroupSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButtonFeminino){
                    textResult.setText("Femenino");
                }else if (checkedId == R.id.radioButtonMasculino){
                    textResult.setText("Masculino");
                }else if (checkedId == R.id.radioButtonSexoNaoInformado){
                    textResult.setText("Sexo não definido");
                }

            }
        });
    }

    public void checkBox(){
        String texto = "";

        if(checkBoxGreen.isChecked()){
            texto = "Verde selecionado ";
        }

        if (checkBoxBlue.isChecked()) {
            texto = "Azul selecionado";
        }

        if (checkBoxRed.isChecked()){
            texto = "Vermelho selecionado";
        }
        textResult.setText(texto);
    }
}