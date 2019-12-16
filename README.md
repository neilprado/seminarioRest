# REST/RESTful - Prática

### Como toda música necessita ter um álbum, então façamos o álbum

1. Clone este repositório, abra a ide e aguarde o download das dependências

2. O model, repository e as classes de DTO já estão devidamente criadas e não precisam ser alteradas

3. Dentro do pacote service, crie uma classe AlbumService e a anote com @Service.

* Crie um método *cadastrarAlbum* que receberá um AlbumRequest como parâmetro, e retornará um Album e esse álbum deverá ser persistido em banco com todos seus campos atribuidos corretamente

* Crie um método *buscarAlbum* que receberá um id como parâmetro e retornará um Album. Lembre-se de levantar uma exceção com erro *404* caso o id passado não conste na base de dados.

* Crie um método *listarAlbuns* que receberá um *pageable* do tipo Pageable e retornará um *Page<Album>* deverá listar de forma paginada todos os álbuns cadastrados.

* Crie um método *removerAlbum* que receberá um id como parâmetro de forma similar ao *buscarAlbum*, inclusive seu comportamento no fluxo de exceção, o método retornará um void.

* Crie um método *atualizarAlbum* que receberá um id e um AlbumRequest como parâmetros, o método funcionará de forma similar ao cadastro e a busca, tratando as exceções com os erros corretos.

3. Dentro do pacote controller em *src/main/java/br.edu.ifpb.distribuida.programacao.rest* crie uma classe chamada AlbumController e criar os seguintes métodos:

* cadastrarAlbum que receberá um AlbumRequest e retornará um ResponseEntity<AlbumResponse>. Inserir a annotation correspondente acima da criação do método e o método deverá chamar o método similar na classe AlbumService.

* buscarAlbum que receberá um id do tipo Long e retornará um ResponseEntity<AlbumResponse>. Inserir a annotation correspondente acima da criação do método e o método deverá chamar o método similar na classe AlbumService.

* listarAlbuns que receberá um Pageable e retornará um ResponseEntity<AlbumResponse>. Inserir a annotation correspondente acima da criação do método e o método deverá chamar o método similar na classe AlbumService.

* atualizarAlbum que receberá um id do tipo Long e um AlbumRequest e retornará um ResponseEntity<AlbumResponse>. Inserir a annotation correspondente acima da criação do método e o método deverá chamar o método similar na classe AlbumService.

* removeralbum que receberá um id do tipo Long e retornará um ResponseEntity<Void>. Inserir a annotation correspondente acima da criação do método e o método deverá chamar o método similar na classe AlbumService.

4. No pacote DTO, na classe MusicaResponse, descomentar as linhas 71 e 85 para que seja possível mostrar o id do Album quando for realizado um novo cadastro ou atualização de musica

5. Na classe Musica, no pacote model, descomentar o @ManyToOne

6. No classe MusicaService no pacote service, nos métodos de cadastro e atualização, insira uma busca pelo id do Album no banco de dados, caso não exista, levante uma exceção com um erro 404.

7. Utilize o Postman ou similares para realizar as operações feitas nessa prática.

