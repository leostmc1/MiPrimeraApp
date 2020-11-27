package com.leo.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class crearcuenta extends AppCompatActivity {
    TextView texto;
    float valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearcuenta);
        texto = findViewById(R.id.texto);
        getIntent().getStringExtra("numero");
        valor = Float.parseFloat(getIntent().getStringExtra("numero"));
        if(valor<16){
            texto.setText("Frutas frescas\n" +
                    "Frutas desecadas\n" +
                    "Frutos secos\n" +
                    "Aceite de oliva virgen extra\n" +
                    "Cereales refinados (Pan, pasta, arroz)\n" +
                    "Muesli");
        }
        else if(valor>=16 && valor<16.99 ){
            texto.setText("Aceite de oliva.\n" +
                    "Arroz integral.\n" +
                    "Cereales: boniato, maíz.\n" +
                    "Frutas secas (pasas, ciruelas pasa).\n" +
                    "Frutos secos (almendras, nueces) y mantequillas vegetales (mantequilla de almendras, de cacahuete).\n" +
                    "Pan integral.\n" +
                    "Pasta integral.\n" +
                    "Proteínas: aves, jamón, carnes, pescados, mariscos, huevos.\n" +
                    "Verduras y hortalizas (incluyendo patata).\n" +
                    "Yogurt griego.");
        }
        else if(valor>=17 && valor<=18.49 ){
            texto.setText("Frutos secos: nueces, almendras, pistachos, etc.\n" +
                    "Alimentos ricos proteínas: carnes magras, pollo, pescados, huevo, productos lácteos, legumbres.\n" +
                    "Aceites de oliva o alimentos ricos en grasas insaturadas (con moderación).\n" +
                    "Existen también algunos trucos útiles que pueden ayudar a tener éxito en las dietas para engordar:\n" +
                    "\n" +
                    "Realiza las cuatro comidas diarias y agrega al menos tres tentempiés. No es necesario que las porciones sean grandes.\n" +
                    "Sustituir el agua por jugo natural de fruta o leche es una muy buena opción en las dietas para engordar.\n" +
                    "Intenta agregar calorías saludables a tus comidas cotidianas, por ejemplo, agrega un huevo cocido a la ensalada o al puré de patatas, incorpora frutas frescas o congeladas dentro del yogurt, pon mermelada o mantequilla sobre las galletas saladas, etc.");
        }
        else if(valor>=18.50 && valor<=24.99 ){
            texto.setText("Su peso es el adecuado, continue con su estilo de vida");
        }
        else if(valor>=25 && valor<=29.99 ){
            texto.setText("Huevos: 3-4 huevos a la semana.\n" +
                    "Carnes: Preferiblemente blancas (pollo o pavo) y una, máximo dos veces de carne roja (ternera)\n" +
                    "Embutidos recomendados: pechuga de pavo, pollo o jamón cocido.\n" +
                    "Pescados: Aumenta su consumo en detrimento de la carne. Procura tomar mínimo 3 veces por semana pescado blanco (merluza, lenguado, bacalao..) y 1 o 2 veces pescado azul (salmón, boquerones, caballa…)\n" +
                    "Marisco: también puedes incorporarlo en tus recetas como pescado blanco. Almejas, berberechos, calamar, sepia, gambas…");
        }
        else if(valor>=30 && valor<=34.99 ){
            texto.setText("100 grs de Pechuga de pollo a la plancha \n + 3 cucharadas de arroz integral\n + ensalada de repollo, tomate\n y remolacha rallada \n+ 1 cucharadita de aceite de oliva \n+ 1 naranja");
        }
        else if(valor>=35 && valor<39.99 ){
            texto.setText("1-2 zanahorias\n" +
                    "Una pieza de fruta o equivalente (taza de fresas o cerezas, 2 mandarinas o ciruelas…) con un puñadito de frutos secos (20 g)\n" +
                    "Yogur o vaso de leche o bebida vegetal con un puñadito de frutos secos (20 g)\n" +
                    "Una onza de chocolate negro de más del 85% con un puñadito de frutos secos (20 g)\n" +
                    "Un puñadito de fruta desecada (sin azúcar añadido en el proceso, unos 20 g) con un puñadito de frutos secos (20 g)");
        }
        else if(valor>=40 ){
            texto.setText("Una latita de atún al natural\n" +
                    "Una latita de berberechos al natural\n" +
                    "Dos cucharadas de garbanzos tostados al horno con especias al gusto\n" +
                    "Una onza de chocolate negro de más del 85% con un puñadito de frutos secos (20 g)\n" +
                    "Un puñadito de fruta desecada (sin azúcar añadido en el proceso, unos 20 g) con un puñadito de frutos secos (20 g)");
        }



    }
}