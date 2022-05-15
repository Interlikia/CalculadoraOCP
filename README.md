# CalculadoraOCP

Nesta calculadora foi implementado o princípio de aberto/fechado para possibilitar a extensibilidade da calculadora com o menor número de altarações possíveis.

* Para realizar a adição de uma nova operação deve-se:
 >Definir uma nova classe com a lógica da nvoa operação que implemente a interface **Operacao**.
 
 >Adicionar no **Switch** da classe Calculadora o novo símbolo da operação para que seja instanciada a operação correta.
