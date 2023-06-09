# [5.19. Exercício: sobrecarga](https://app.algaworks.com/aulas/86/exercicio-sobrecarga)

Você trabalha em uma empresa especialista em máquinas de fazer café e sua equipe é a responsável por desenvolver uma classe para o novo modelo de cafeteiras que irão fabricar.

No modelo anterior das cafeteiras, os usuários podiam selecionar se era para ser adicionado açúcar ou não, mas a nova versão da Super Cafeteira Tabajaras Plus++ deve ser capaz de receber a quantidade (em gramas) de açúcar a ser colocada no café.

Mesmo com essa nova possibilidade, o usuário não será obrigado a informar quanto de açúcar deseja. Deve-se adicionar 10 gramas de açúcar por padrão caso nenhum valor seja informado.

1. Para começar, crie a classe "MaquinaCafe" com um atributo chamado "acucarDisponivel", que será útil para saber a quantidade de açúcar disponível na máquina. Se o açúcar acabar, a máquina só permitirá cafezinhos sem açúcar, certo?

```java
class MaquinaCafe {

	int acucarDisponivel;

}
```
2. Agora crie um método chamado "fazerCafe" na mesma classe. Esse método deve verificar se a quantidade de açúcar disponível na máquina é suficiente e, claro, fazer o café.

```java
void fazerCafe(int quantidadeAcucar) {
	if (acucarDisponivel < quantidadeAcucar) {
		System.out.println("Não há açucar suficiente para fazer seu café.");
	} else {
		acucarDisponivel -= quantidadeAcucar;
		System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
	}
}
```

3. Como o usuário não será obrigado a informar a quantidade de açúcar a ser adicionado no café, crie outro método com o nome "fazerCafe", que não recebe nenhum parâmetro. Isso é uma sobrecarga de métodos! Veja como devem ficar os dois métodos que fazem cafés:

```java
void fazerCafe() {
	if (acucarDisponivel < 10) {
		System.out.println("Não há açucar suficiente para fazer seu café.");
	} else {
		acucarDisponivel -= 10;
		System.out.println("Fazendo cafezinho com 10 gramas de açucar.");
	}
}

void fazerCafe(int quantidadeAcucar) {
	if (acucarDisponivel < quantidadeAcucar) {
		System.out.println("Não há açucar suficiente para fazer seu café.");
	} else {
		acucarDisponivel -= quantidadeAcucar;
		System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
	}
}
```
		
4. Você deve ter percebido que os códigos dos dois métodos ficaram bem parecidos, certo? Sem pânico! Vamos melhorar fazendo um método chamar outro, aproveitando toda a lógica. Substitua os dois métodos por:

```java
void fazerCafe() {
	fazerCafe(10);
}

void fazerCafe(int quantidadeAcucar) {
	if (acucarDisponivel < quantidadeAcucar) {
		System.out.println("Não há açucar suficiente para fazer seu café.");
	} else {
		acucarDisponivel -= quantidadeAcucar;
		System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
	}
}
```
		
5. Crie uma classe agora para testar a máquina de café, afinal de contas, você deve evitar entregar código-fonte com bugs. Crie uma nova classe chamada "TesteMaquinaCafe" que instancia uma "MaquinaCafe" e atribui a quantidade de açúcar disponível.

```java
class TesteMaquinaCafe {
	
	public static void main(String[] args) {
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.acucarDisponivel = 30;
	}
	
}
```

6. Chame os métodos "fazerCafe" com diferentes valores para testar o funcionamento da máquina. No exemplo abaixo, o terceiro café não será possível de ser feito, pois não haverá mais açúcar disponível na máquina.

```java
MaquinaCafe maquina = new MaquinaCafe();
maquina.acucarDisponivel = 30;

maquina.fazerCafe(10);
maquina.fazerCafe(15);

// faz cafe com a quantidade de açúcar padrão
// não será possível fazer esse cafezinho, pois a máquina
// só tinha 30gr de açúcar disponível
maquina.fazerCafe();
```
>Dica do professor: use o debugger do Eclipse e execute o exemplo passo a passo. Isso ajuda bastante a entender o funcionamento e fixar os conceitos.