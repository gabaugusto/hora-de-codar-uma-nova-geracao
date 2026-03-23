Bem-vindo ao Simulador de Animal de Estimação Virtual, onde você terá a oportunidade de cuidar do seu próprio animal de estimação virtual e aprender sobre programação orientada a objetos ao mesmo tempo!Você está embarcando em uma jornada emocionante no mundo da programação orientada a objetos! 

Neste mundo fascinante, os programas são organizados em torno de objetos, entidades que possuem características (atributos) e comportamentos (métodos). Essa abordagem de programação permite modelar o mundo real de uma forma poderosa e flexível.Imagine que você é um cuidador de animais e acabou de receber a responsabilidade de cuidar de um animal de estimação virtual. 

Sua tarefa é garantir que o animal esteja feliz e saudável, cuidando de suas necessidades básicas, como alimentação e entretenimento.Você terá acesso ao código fonte do Simulador de Animal de Estimação Virtual, que já inclui a estrutura básica para criar e interagir com o animal virtual. Sua missão é ampliar este código, adicionando novas funcionalidades e melhorias para tornar a experiência ainda mais envolvente.

O animal de estimação virtual possui os seguintes atributos:
Nome
Nível de fome: um número inteiro que representa a fome do animal. Quanto maior, maior a fome.# Simulador de Bichinho Virtual (POO)

Bem-vindo(a)!  
Neste projeto, você vai praticar **Programação Orientada a Objetos** criando um bichinho virtual e cuidando dele no dia a dia.

## O que é o bichinho virtual?

Seu pet tem atributos (estado) e métodos (ações).

### Atributos iniciais
- **Nome**
- **Fome** (quanto maior, mais fome)
- **Felicidade** (quanto maior, mais feliz)

### Ações principais
- **Alimentar**: diminui a fome
- **Brincar**: aumenta a felicidade
- **Verificar status**: mostra os valores atuais do pet

Além disso, o jogo simula a passagem do tempo.

---

## Evoluindo o projeto

Implemente as melhorias abaixo:

1. **Cansaço**
    - Adicione o atributo `cansaço`.
    - Sempre que o pet brincar, o cansaço aumenta.

2. **Descansar**
    - Crie um método para o pet descansar.
    - Descansar deve diminuir o cansaço.

3. **Idade**
    - Adicione o atributo `idade`.
    - A cada ciclo de tempo, a idade aumenta em 1.
    - Atualize `verificarStatus` para mostrar a idade.

---

## Regras do jogo

### Objetivo
- Fazer o bichinho chegar à **idade 50**.

### Derrota
- Se a **fome** chegar a `100`, você perde.
- Se o **cansaço** chegar a `100`, você perde.
- Se a **felicidade** chegar a `0`, você perde.

### Passagem do tempo (por ciclo)
- **Fome**: aumenta em `3`
- **Felicidade**: diminui em `3`
- **Cansaço**: aumenta em `10`
- **Idade**: aumenta em `1`

---

## Desafios extras (opcional)

Se quiser deixar o jogo mais completo:

- No método `descansar`, pedir por quantas horas o pet vai descansar.
- Considerar que com **8 horas** ele fica totalmente descansado.
- Criar um medidor de **vontade de ir ao banheiro** (aumenta ao alimentar).
- Criar um medidor de **sujeira** (aumenta ao brincar).
- Definir limites para esses medidores: se ultrapassar, o jogador perde.

---

Divirta-se construindo e evoluindo seu bichinho virtual! 🐾

Nível de felicidade: um número inteiro que representa o quão feliz o animal está. Quanto maior, maior a felicidade.)
O animal de estimação virtual possui os seguintes comportamentos (métodos):
Alimentação: Diminui o nível de fome em uma certa quantidade.
Brincar: Aumenta o nível de felicidade em uma certa quantidade.
Verificando status: Exibe o status atual do animal de estimação (nome, nível de fome, nível de felicidade)
O bichinho virtual também simula a passagem do tempo, onde o nível de fome aumenta gradativamente ao longo do tempo.
Há uma interface de usuário onde os usuários possam interagir com o animal de estimação virtual escolhendo ações (alimentar, brincar, verificar status).

Interagir para entender

1. Explore o Simulador: Entre no mundo do Simulador de Animal de Estimação Virtual e mergulhe na experiência! Experimente jogar um pouco, familiarize-se com o funcionamento do jogo e estabeleça alguns objetivos para si mesmo. Observe atentamente se tudo se comporta como você espera.
 2. Adicione um Atributo de Cansaço: Agora é hora de elevar o nível do jogo! Experimente adicionar um novo atributo chamado "cansaço" ao bichinho virtual, juntamente com um método correspondente. Quanto mais o bichinho virtual brinca, mais cansado ele fica. Teste se a adição desse novo elemento funciona conforme o esperado.
3. Mas espera, se o bichinho virtual fica cansado, também é crucial que ele possa descansar, não é mesmo? Adicione um método que permita ao bichinho virtual descansar e diminuir o valor do atributo "cansaço". Vamos dar uma chance a essa nova funcionalidade?
4. Eleve o Nível: Agora é hora de levar as coisas para o próximo nível! Vamos criar um novo atributo chamado "idade" para o bichinho virtual. Sempre que o tempo passar, a idade do bichinho virtual aumentará em um! Prepare-se para dar um passo adiante e enriquecer ainda mais a experiência do jogo.
Agora que você adicionou um novo atributo, é hora de atualizar o método que exibe o status do bichinho virtual. Certifique-se de que o método "verificarStatus" agora também exibe a idade do bichinho virtual. Teste se a nova funcionalidade está funcionando conforme o esperado.
