Algoritmo AlternativaDoble2
	Definir monto, descuento Como Real
	Definir fdep Como Caracter
	Escribir "Precio producto"
	Leer monto
	Escribir "Forma de pago"
	Leer fdep
	descuento = monto - (monto*10/100)
	Si fdep == "Contado" Entonces
		Escribir "Su precio a pagar es " descuento
	SiNo
		Escribir "Su forma de pago no tiene descuento"
	FinSi
	
FinAlgoritmo
