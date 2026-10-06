package com.javier.daw.unidades.ud1.elementosdeunprograma;

public class OperadoresExpresionesConversiones {
    int total = 10 + 5*2; // 20
    int resto = 17%5; // 2

    double d = 5; // implícita: int .> double
    int n = (int) 5.9; // explícita: double .> int, n vale 5 (pierde decimales)
}
