def pertence_fibonacci(numero):
    a, b = 0, 1
    while b < numero:
        a, b = b, a + b
    return b == numero or numero == 0

numero = 21  # Digite o número para conferir
print(f"O número {numero} {'pertence' if pertence_fibonacci(numero) else 'não pertence'} à sequência de Fibonacci.")
