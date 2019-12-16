## Como configurar um hello world?

1. Acesse https://start.spring.io/
* No campo group, altere para br.edu.ifpb
* No campo artifact, altere para hello
* No campo dependências, insira *Web*
* Clique em generate

2. Extraia o conteúdo do arquivo compactado que foi baixado, abra a IDE de sua preferência
* Aguarde o download da dependência
* Dentro de *src/main/java/br.edu.ifpb.hello* crie um package de nome controller e dentro dele crie uma classe chamada *HelloController*

3. Acima de *public class HelloController* insira as annotations *@RestController* e *@RequestMapping("/hello")*

4. Crie um método chamado *helloWorld()* que retorna uma String e retorne *Hello World*, acima do método, insira a annotation *@GetMapping*

5. Inicie o projeto e no navegador acesse: *http://localhost:8080/hello*

6. A resposta deverá ser: *Hello World*