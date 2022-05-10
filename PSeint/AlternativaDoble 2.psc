Algoritmo AlternativaDoble
	definir monto, descuento Como Real
	definir Fdep Como Caracter
	Escribir "Precio producto"
	Leer monto
	descuento = monto - (monto * 10 / 100)
	Escribir "Forma de pago"
	Leer Fdep
	Si Fdep == "contado" Entonces
		Escribir "Debe pagar " descuento
	SiNo
		Escribir "Su producto no tiene descuento "  monto
	FinSi
	
FinAlgoritmo
