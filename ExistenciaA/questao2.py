def contar_letra_a(texto):
    contador = sum(1 for char in texto if char.lower() == 'a')
    return contador

texto = "Python é uma linguagem fantástica"  # Digite uma String de sua preferência!
ocorrencias = contar_letra_a(texto)
print(f"A letra 'a' aparece {ocorrencias} vez(es) na string.")
