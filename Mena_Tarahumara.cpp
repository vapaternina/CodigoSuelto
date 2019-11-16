#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	int m=0, n=0, resta=0, o=0, longitud=0, cont=0;
	// Inicializa siempre tus variables, te evitará problemas con 'null'.
	string numero = ""; 
	
	//Quité de aquí la declaración de la matriz string cadena[m][80]
	//porque como los vectores y matrices son estructura de datos estáticas
	//va a tomar el valor de m = 0 y no vas a poder cambiarlo después,
	//por ejemplo, cuando hacías cin >> m;
	
	do{
	    cout << "Digite m (1 a 10): ";
	    cin >> m;
	    if (m > 10 || m < 1){ //Mensaje de validación
	        cout << "Por favor, ingrese m entre 1 y 10." << endl;
	    }
	}while(m <= 0 || m > 10); //Esto va a continuar solicitando m hasta que esté entre 1 y 10.
	
	//Luego de que se pide m inicializas el vector (en vez de una matriz) con m elementos, que sería lo ideal.
	string cadena[m];
	
	//Ahora requerimos los m números con hasta 80 digitos.
	cout << "Digite los siguientes valores con hasta 80 digitos." << endl;
	
	//Mientras que no se hayan obtenido todos los m números, continuar solicitandolos
	while(cont < m){ 
	    cout << "Digite el número [" << cont << "]: "; // Lo mejor es mostrar qué se está solicitando.
		cin >> numero;
		//Verificamos que el número de digitos sea menor que 80.
		//El método length() sobre una variable de tipo string te devuelve el número de caracteres que tiene.
		if (numero.length() < 80){
		    //Si es menor, lo guardamos.
		    cadena[cont] = numero;
		    //Aumentamos el contador en 1 para indicar que tenemos un número válido más.
		    cont = cont + 1; 
		}else{
		    //Si el número no es menor de 80 digitos, no lo guardamos y preguntamos de nuevo.
		    cout << "Por favor, digite un número con menos de 80 digitos." << endl;
		}
	}
}
