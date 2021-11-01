<div id="top"></div>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="https://refactoring.guru/images/content-public/logos/logo-covid-2x.png" alt="Logo" width="350" height="382">
  </a>

<h3 align="center">PATRONS de CONCEPTION</h3>

  <p align="center">
    <a href="https://refactoring.guru/fr"><strong>Visiter »</strong></a>
    <br />
    <br />
  </p>
</div>


## C'est quoi les Patron de Conception ?

![Patron de conception](https://refactoring.guru/images/patterns/content/index-design-patterns-2x.png)

Les **patrons de conception** sont des solutions classiques à des problèmes récurrents de la conception de logiciels. Ce sont des sortes de plans ou de schémas que l’on peut personnaliser afin de résoudre un problème récurrent dans notre code.

Vous ne pouvez pas vous contenter de trouver un patron et de le recopier dans votre programme comme vous le feriez avec des fonctions ou des librairies prêtes à l’emploi. Un patron, ce n’est pas un bout de code spécifique, mais plutôt un concept général pour résoudre un problème précis. Vous pouvez suivre le principe du patron et implémenter une solution qui convient à votre propre programme.

Les patrons sont souvent confondus avec les algorithmes, car ils décrivent tous deux des solutions classiques à des problèmes connus. Un algorithme définit toujours clairement un ensemble d’actions qui va vous mener vers un objectif, alors qu’un patron, c’est la description d’une solution à un plus haut niveau. Le code utilisé pour implémenter un même patron peut être complètement différent s’il est appliqué à deux programmes distincts.

Un algorithme c’est un peu comme une recette de cuisine, ses étapes sont claires et vous guident vers un objectif précis. Un patron, c’est plutôt comme un plan : vous pouvez voir ses fonctionnalités et les résultats obtenus, mais la manière de l’implémenter vous revient.

<p align="right">(<a href="#top">Retour en haut</a>)</p>



### Pourquoi devrais-je apprendre les patrons de conception ?

En vérité, il est possible de travailler comme développeur pendant de nombreuses années sans avoir jamais appris un seul patron. C’est le cas pour de nombreuses personnes. Mais même si vous faites partie de ces personnes, il est fort probable que vous les utilisiez sans vous en rendre compte. Pourquoi devriez-vous donc prendre le temps de les apprendre ?
* Les patrons de conception sont une boîte à outils de solutions fiables et éprouvées utilisées en réponse à des problèmes classiques de la conception de logiciels. Même si vous n’avez jamais rencontré ces problèmes, le fait de connaitre les patrons est tout de même utile, car il vous enseigne des techniques qui permettent de résoudre toutes sortes de problèmes en utilisant les principes de la conception orientée objet.
* Les patrons de conception définissent un langage commun que vous et vos collègues pouvez utiliser pour mieux communiquer. Vous pouvez dire : « Oh, tu n’as qu’à utiliser un singleton. » et tout le monde comprendra instantanément ce que vous venez de suggérer. Nul besoin d’expliquer ce qu’est un singleton, si vous connaissez déjà son nom et son principe.

[Critique des patrons de conception](https://refactoring.guru/fr/design-patterns/criticism)

<p align="right">(<a href="#top">Retour en haut</a>)</p>


### Classification des patrons de conception

Les patrons diffèrent par leur complexité, leur niveau de détails et l’échelle à laquelle ils sont applicables à un système en cours de conception. Je trouve l’analogie faite avec la construction d’une route plutôt parlante : vous pouvez installer des feux de circulation pour renforcer la sécurité d’une intersection ou construire un échangeur à plusieurs niveaux et muni de passages souterrains pour les piétons.

Les patrons les plus basiques et de plus bas niveau sont souvent appelés des idiomes. Ils sont généralement conçus pour un langage de programmation spécifique.

Les patrons de conception les plus universels et de plus haut niveau sont des patrons d’architecture. Les développeurs peuvent implémenter ces patrons dans à peu près n’importe quel langage. Contrairement aux autres patrons, ils peuvent être utilisés pour concevoir la totalité de l’architecture d’une application.

De plus, tous les patrons de conception peuvent être catégorisés selon leur intention ou leur objectif. Ce livre couvre les trois groupes principaux de patrons :

* Les **Patrons de création** fournissent des mécanismes de création d’objets, ce qui augmente la flexibilité et la réutilisation du code.
    * [Fabrique](https://refactoring.guru/fr/design-patterns/factory-method) (Factory Method)
    * [Fabrique Abstraite](https://refactoring.guru/fr/design-patterns/abstract-factory) (Abstract Factoy)
    * [Monteur](https://refactoring.guru/fr/design-patterns/builder) (Builder)
    * [Prototype](https://refactoring.guru/fr/design-patterns/prototype)
    * [Singleton](https://refactoring.guru/fr/design-patterns/singleton)
    
* Les **Patrons structurels** expliquent comment assembler des objets et des classes en de plus grandes structures, tout en les gardant flexibles et efficaces.
    * [Adaptateur](https://refactoring.guru/fr/design-patterns/adapter) (Adapter)
    * [Pont](https://refactoring.guru/fr/design-patterns/bridge) (bridge)
    * [Composite](https://refactoring.guru/fr/design-patterns/composite)
    * [Façade](https://refactoring.guru/fr/design-patterns/facade) (Facade)
    * [Décorateur](https://refactoring.guru/fr/design-patterns/decorator) (Decorator)
    * [Poids mouche](https://refactoring.guru/fr/design-patterns/flyweight) (Flyweight)
    * [Procuration](https://refactoring.guru/fr/design-patterns/proxy) (Proxy)
    
* Les **Patrons comportementaux** mettent en place une communication efficace et répartissent les responsabilités entre les objets.
    * [Chaine de responsabilité](https://refactoring.guru/fr/design-patterns/chain-of-responsibility) (Chain of Responsibility)
    * [Commande](https://refactoring.guru/fr/design-patterns/command) (Command)
    * [Mémento](https://refactoring.guru/fr/design-patterns/memento) (Memento)
    * [Observateur](https://refactoring.guru/fr/design-patterns/observer) (Observer)
    * [Itérateur](https://refactoring.guru/fr/design-patterns/iterator) (Iterator)
    * [Médiateur](https://refactoring.guru/fr/design-patterns/mediator) (Mediator)
    * [État](https://refactoring.guru/fr/design-patterns/state) (State)
    * [Stratégie](https://refactoring.guru/fr/design-patterns/strategy) (Strategy)
    * [Patron de méthode](https://refactoring.guru/fr/design-patterns/template-method) (Template Method)
    * [Visiteur](https://refactoring.guru/fr/design-patterns/visitor) (Visitor)

<p align="right">(<a href="#top">Retour en haut</a>)</p>

<!-- CONTACT -->
## Contact

Morgan NEHDI -  contact@morgan-nehdi.com
Project Link: [DesignPattern](https://github.com/PixelDream/DesignPatern)