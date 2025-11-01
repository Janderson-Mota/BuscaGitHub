# 🧩 BuscaGitHub — Consulta de API do GitHub com Spring Boot

Este é o **primeiro projeto desenvolvido com Spring Boot**, com o objetivo de **consumir a API pública do GitHub** e exibir informações de um perfil diretamente no **console**.

O projeto faz uma requisição HTTP para a API, lê os dados em formato **JSON**, converte para um objeto Java e mostra informações formatadas sobre o usuário.

---

## 🚀 Tecnologias utilizadas

* ☕ **Java 17+**
* 🌱 **Spring Boot**
* 🔗 **API pública do GitHub**
* 🧰 **Gson (Google)**
* 🧱 **Maven**

---

## 🧠 Conceitos aplicados

* Injeção de dependências (**IoC**)
* Consumo de **APIs REST**
* Leitura e conversão de dados **JSON**
* Execução via **CommandLineRunner**
* Organização do código em camadas (**Modelo**, **Serviço**, **Principal**)

---

## 💻 Exemplo de saída no console

```
Perfil:
   Id: 972709
   Nome: ffffffff
   Biografia: null
   Url: https://github.com/ffffffff
```

---

## 📂 Estrutura do projeto

```
src/
 ├── main/
 │   ├── java/br/com/janderson/BuscaGitHub/
 │   │   ├── Modelo/
 │   │   │   └── Perfil.java
 │   │   ├── Servico/
 │   │   │   ├── ConsumoApi.java
 │   │   │   └── LeitorDados.java
 │   │   └── Principal.java
 │   └── resources/
 │       └── application.properties
 └── test/
```

---

## 🧾 Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/Janderson-Mota/BuscaGitHub.git
   ```

2. Acesse a pasta do projeto:

   ```bash
   cd BuscaGitHub
   ```

3. Execute o projeto:

   ```bash
   mvn spring-boot:run
   ```

4. Veja a saída no console com as informações do perfil GitHub consultado 🎯

---

## ✨ Autor

👤 **Janderson Mota**
📘 Ciência da Computação | 🚀 Estudante e desenvolvedor em crescimento
🔗 [github.com/Janderson-Mota](https://github.com/Janderson-Mota)

---

⭐ *Se este projeto te ajudou, não esqueça de deixar uma estrela no repositório!*
