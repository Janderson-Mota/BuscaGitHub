# 🧩 BuscaGitHub — Consulta de API do GitHub com Spring Boot

Este é o **primeiro projeto desenvolvido com Spring Boot**, criado para **consumir a API pública do GitHub** e exibir informações detalhadas de um perfil diretamente no **console**. 🖥️💡

O sistema realiza uma requisição HTTP, interpreta o retorno em **JSON**, converte para um objeto Java e apresenta os dados de forma organizada e estilizada.

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
* Conversão de dados **JSON → Objetos Java**
* Execução via **CommandLineRunner**
* Arquitetura organizada em camadas (**Modelo**, **Serviço** e **Principal**)

---

## 💻 Exemplo de saída no console

```
🌐 ===== PERFIL ENCONTRADO =====
🆔 ID: 179471893
👤 Nome: Janderson-Mota
💬 Biografia: Entre o código e a bateria, sempre no tempo certo. 💻🥁
🔗 Perfil GitHub: https://github.com/Janderson-Mota
===============================
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

4. Veja o resultado no console e acompanhe as informações do perfil consultado 🎯

---

## ✨ Autor

👤 **Janderson Mota**
📘 Ciência da Computação 
💬 “Entre o código e a bateria, sempre no tempo certo.”
🔗 [github.com/Janderson-Mota](https://github.com/Janderson-Mota)

---

⭐ *Se este projeto te inspirou, deixe uma estrela e acompanhe as próximas versões!* 🌟
