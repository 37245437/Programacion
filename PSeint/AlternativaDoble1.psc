Algoritmo AlternativaDoble1
	Definir bancos, alumnos, resultado Como Entero
	Escribir "Cantidad de alumnos"
	Leer alumnos
	Escribir "Cantidad de bancos"
	Leer bancos
	resultado = alumnos - bancos
	Si bancos >= alumnos Entonces
		Escribir "Permitido"
	SiNo
		Si bancos < alumnos Entonces
			Escribir "Faltan bancos " resultado
		FinSi
		
	FinSi
	
FinAlgoritmo
