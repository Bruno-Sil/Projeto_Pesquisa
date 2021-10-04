# Engenharia de Software

**Plano de ensino:**

- Ementa
    - Discute as disciplinas da engenharia de _software_ dando maior ênfase nas áreas do conhecimento mais relevantes para o desenvolvimento de aplicações web, como requisitos não-funcionais, arquitetura, testes e qualidade de _software_, evolução e entrega contínua.
    - A disciplina apresenta o modelo de referência da ISO 25.000 para a qualidade de _software_, bem como o uso de modelos ágeis para dar suporte ao dinamismo das aplicações web.

- Objetivos
    - Entender características do _software_ e de seu ciclo de vida
    - Adquirir conhecimento sobre técnicas para construção de _software_, englobando modelagem orientada a objetos, definição de arquitetura de _software_, integração e entrega contínua.
    
---
    
## Aula 01: Apresentação da Engenharia de _software_


### O que é a Engenharia de _Software_?

- É a ciência/arte/profissão de adquirir e aplicar conhecimentos para o desenvolvimento de _softwares_.

### Por quê utilizar a engenharia de _software_?

- Nos últimos anos o hardware deixou de ser o item mais caro na implementação de um sistema, enquanto que o custo relacionado ao _software_ cresceu e se tornou o principal item no orçamento da computação.
- Isso se deve principalmente pela crescente complexidade dos problemas a serem resolvidos pelos _softwares_. Sistemas como os de gestão hospitalar e sistemas de PEP chegam a possuir milhões de linhas de código e envolvem vários especialistas para o seu desenvolvimento. 
- Aliado a isso, alguns problemas inerentes ao processo de desenvolvimento de um software começaram a surgir 1 : as estimativas de prazo e de custo freqüentemente são imprecisas, a produtividade das pessoas da área de software não tem acompanhado a demanda por seus serviços e, a qualidade de software às vezes é menos que adequada, ocorrendo muito freqüentemente a insatisfação do usuário.
- A chave para se vencer esses problemas e dificuldades acima relatados é a larga utilização de uma abordagem de engenharia ao desenvolvimento de software, aliada a uma contínua melhoria das técnicas e ferramentas no intuito também de melhorar a produtividade da equipe.

### Características da Engenharia de _software_

- Nova, se comparada a Engenharia Civil por exemplo.
- Está em evolução (vide o livro do Pressman).

### SWEBOK v3.0 - _Software Engineering Body of Knowledge_

- Áreas do conhecimento
    - **Requisitos**
    - **Design (projeto)**
    - Construção
    - **Testes**
    - Manutenção
    - **Gestão de configuração**
    - Gestão de engenharia
    - **Processos**
    - Modelos e métodos
    - **Qualidade**
    - Prática profissional
    - Economia
    - Fundamentos: computacionais; matemáticos; de engenharia.

### ISO 25000

- Conjunto de normas (modelo de referência) que devem ser seguidas para garantir a qualidade do _software_.
- Mostra quais requisitos devem ser cumpridos, porém não mostra como.

---

## Aula 02: Processos de desenvolvimento de _software_

- **Processo**
    - Sucessão sistemática de mudanças numa direção definida.
    - Série de ações sistemáticas visando certo resultado.
    - Série de ações que ocorrem de uma maneira determinada.
- **Framework**
    - Armação de uma construção.
- **Desenvolvimento**
    - Crescimento ou expansão gradual.
    - Passagem gradual de um estágio inferior a um mais aperfeiçoado.
- Melhoria é o objetivo. Mudança é o caminho.
- Processo de desenvolvimento é uma das disciplinas da engenharia de _software_.

### ISO/IEC 12207

- _Software life cycle process_.
- Ajuda a escolher o processo de desenvolvimento.
- Padrão que define as tarefas necessárias para desenvolver o _software_.

### Por quê se preocupar com isso?

- Sempre que um _software_ recebe atualizações, novos defeitos são encontrados. Isso faz com que o _software_ se distancie cada vez mais da curva ideal.
- O custo de correção de defeitos cresce exponencialmente durante o processo de desenvolvimento. Um defeito descoberto na fase de requisitos e resolvido logo em seguida, tem um custo muito menor do que um que foi descoberto na fase de requisitos, mas só foi corrigido na fase de construção do _software_.

### Processos existentes

- Alguns dos processos de desenvolvimento de _softwares_ existentes no mercado:
- _Waterfall_ (cascata)
- Prototipação
- RUP (_Rational Unified Process_)
- XP (_Extreme Programming_)
- Scrum
- Kanban
- FDD (_Feature-driven Development_)
- TDD (_Test-driven Development_)
- BDD (_Behavior-driven Development_)
- DDD (_Domain-driven Development_)

#### Waterfall

_System requirements_ <-> _Software requirements_ <-> _Analysis_ <-> _Program design_ <-> _Coding_ <-> _Testing_ <-> _Operations_

- Os processos são seguidos um após o outro.
- A entrega é feita somente no final do processo de desenvolvimento.

#### RUP

- 4 fases: iniciação, elaboração, construção, transição.
- 9 disciplinas: modelagem de negócio, requisitos, análise e design, implementação, testes, implantação, gestão de configuração, gestão de projeto, ambiente.
- 5 macro papéis: analistas, desenvolvedores, testadores, gerentes e adicionais.
- 33 papéis.
- 75 artefatos.

#### Modelo V

- O Modelo V (_V Model_ - em inglês) é a representação gráfica do ciclo de vida de um _software_. Ele contém os principais passos a serem feitos durante o processo, bem como as entregas esperadas em cada uma das etapas.

        Especificação de requisitos ------------> Teste de aceitação
             Projeto de alto nível --------> Teste de sistema
               Projeto detalhado ----> Teste de aceitação
                    Codificação --> Teste de unidade
                    
#### Lean/Kanban

- Trello

#### TDD

- 1: Escreva um teste que falhe.
- 2: Faça o código funcionar.
- 3: Refatore. Elimine redundância.

#### XP

- O objetivo do XP (_Extreme Programming_) é fazer com que as pessoas escrevam código de mais qualidade de uma maneira mais produtiva.
- O XP possui 12 práticas, que estão agrupadas em 4 áreas:
- _Fine-scale feedback_
    - _Pair programming_
    - _Planning game_
    - _TDD_
    - _Whole team_
- _Continuous process_
    - _Continuous integration_
    - _Refactoring or design improvement_
    - _Small releases_
- _Shared understanding_
    - _Coding standards_
    - _Collective code ownership_
    - _Simple design_
    - _System metaphor_
- _Programmer welfare_
    - _Sustainable pace_
    - _Coding_
        - The customer is always available
        - Code the unit test first
        - Only one pair integrates code at a time
        - Leave optimization until last
        - No overtime
    - Testing
        - All code must have unit tests
        - All code must pass all unit tests before it can be released
        - When a bug is found tests are created before the bug is addressed (a bug is not an error in logic, it is a test that was not written)
        - Acceptance tests are run often and the results are published

#### Scrum

- _Framework_ para desenvolvimento ágil.
- _Backlog_ do produto.
- _Backlog_ do _sprint_.
- _Sprints_ curtos (1 a 4 semanas).
- Reuniões diárias.
- Entrega ao final de cada _sprint_.

### Requisitos não-funcionais para aplicações Web

- **Requisito**
    - Condição a que se deve satisfazer para que uma coisa fique legal e regular.
    - Exigência imprescindível para a consecução de certo fim.
- Existe uma disciplina específica apenas para requisitos: **Engenharia de Requisitos**
- IEEE 830: Norma para especificação de requisitos de _software_.
- **Requisitos funcionais:** Definem o comportamento e funções específicas (pedidos do cliente).
- **Requisitos não-funcionais:** Como o software fará algo, não o que fará (obrigações implícitas).

#### Principais requisitos não-funcionais para a web

- **Confiabilidade:** Fluxo de navegação; completar a transação.
- **Desempenho:** Tempo de resposta.
- **Disponibilidade:** Estar _online_ sempre, 24x7.
- **Gestão de configuração (time-to-market):** Controle de entrega; implantação.
- **Segurança:** Manter a integridade de informações e dados. Negar acesso e alterações a pessaos/sistemas não autorizados.
- **Portabilidade**
- **Usabilidade:** Possuir efetividade e eficiência e ser atrativo para o usuário realizar determinadas ações.

---

## Aula 03: Projeto (design) de _software_

- Conceitos
    - **Design:** Concepção de um projeto ou modelo; planejamento.
    - **Projeto:** Plano para a relaização de um ato.
- Comunicar as informações de _design_ para as partes interessadas (_stakeholders_).
- IEEE 1016-2009 - _SDD - Software Design Descriptions_
- Padrões de projeto (_design patterns_)
    - Solução geral
    - Reutilizável
    - Resolve um problema que ocorre com frequência
    - Contexto determinado
    - Exemplos:
        - _MVC - Model-View-Controller_
        - _ORM - Object Relational Mapping_
        - _Page Controller_
        - _Singleton_
        - _Facade_
- _Zachman Framework_
    - _What:_ O que será feito (etapas).
    - _Where:_ Onde será feito (local).
    - _Who:_ Por quem será feito (responsabilidade).
    - _When:_ Quando será feito (tempo).
    - _Why:_ Por que será feito (justificativa).
    - _How:_ Como será feito (método).
    - _How much:_ Quanto custará fazer (custo).
- _WAAF - Web Application Architecture Framework_
- _UML - Unified Modeling Language_
    - Linguagem de comunicação entre as partes interessadas
    - Ferramenta de modelagem de aplicações
    - Diagramas mais comuns:
        - Classe
        - Sequência
        - Atividades
        - Estado
        - _Deployment_
        
---

## Aula 04: Teste de _software_

- **Conceitos:**
    - Erro: engano, erro humano.
    - Defeito: produto do erro, _bug_.
    - Falha: resultado do defeito, _bug_ em produção.
    - Verificação: atendimento aos requisitos.
    - Validação: cumprimento da finalidade.
- **Métodos:**
    - Estático: revisão, inspeção (verificação).
    - Dinâmico: casos de teste executados (validação).
    - Caixa branca: testes internos (desenvolvedor).
    - Caixa cinza: testes externos com conhecimentos internos (cálculos, estrutura de dados, algoritmos, etc).
    - Caixa preta: testes externos (usuários).
- **Níveis de teste:**
    - Unitário: menor unidade testável do _software_.
    - Integração: funcionamento das unidades em conjunto.
    - Interface: troca de informações entre módulos.
    - Sistema: teste de aceitação, visão usuário-requisito.
- **Tipos de teste:**
    - Regressão
    - Aceitação
    - Usabilidade
    - Concorrência
    - Alpha, Beta
- **Processo de teste:**
    - _Waterfall_
        - Célula de testadores
        - No fim do processo
        - Antes de entregar para o cliente
    - _Agile ou XP_
        - Suporte via _TDD_
        - Integração contínua
- **Artefatos de teste:**
    - Plano de testes
    - Matriz de rastreabilidade (requisito vs caso de teste)
    - Suite de testes
    - Caso de teste
    - Script de teste
    - Dados de teste
- **Ferramentas:** Selenium, Simpletest, JUnit, QUnit, Testlink, JMeter.
- **Integração contínua:** É o termo utilizado para designar um conceito surgido com o desenvolvimento ágil onde o desenvolvedor integra o código alterado ao projeto principal com uma grande frequência. Por isso, atualmente, esse processo pode ocorrer diversas vezes ao dia, ao invés de uma única vez.

---

## Aula 05: Qualidade de _software_ e ISO 25.000

- O modelo de qualidade de _software_ determina **quais** características serão levadas em consideração durante a avaliação do produto final.
- A qualidade de um sistema é o grau em que o sistema satisfaz as necessidades explícitas e implícitas de seus diversos públicos, e, portanto, fornece valor.

### Principais métricas (ISO 25.010)

- Adequação funcional
    - Completude; exatidão; apropriada.
- Eficiência do desempenho
    - Comportamento de tempo; Uso de recursos; Capacidade.
- Compatibilidade
    - Co-existência; Interoperabilidade.
- Usabilidade
    - Habilidade apropriada de reconhecimento; Aprendizado; Operação.
    - Proteção contra erros de usuário.
    - Estética de interface de usuário.
    - Acessiblidade.
- Confiabilidade
    - Maturidade; Disponibilidade; Tolerância a falhas; Recuperabilidade.
- Manutenibilidade
    - Modularidade; Reusabilidade; Analisabilidade; Modificabilidade; Testabilidade.
- Portabilidade
    - Adaptabilidade, Instabilidade, substituível.
---

## Aula 06: Integração de sistemas

---

## Aula 07: _DevOps - Development & Operations_

- Termo cunhado em 2008/2009.
- Também conhecido como entrega contínua (_continuous delivery_).
- Integração entre o desenvolvimento e infraestrutura de TI.
- Busca suavizar as transições entre os ambientes de desenvolvimento, homologação e produção.
