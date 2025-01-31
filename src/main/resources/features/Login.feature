#language:pt

@test
Funcionalidade: Login

    Contexto: O usuário deseja logar na plataforma

    @smoke
    Cenario: Validar login com sucesso
        Dado que estou na pagina de login
        E preencho corretamente o campo username
        E preencho corretamente o campo password
        Quando clico em Login
        Então devo ser redirecionado para o dashboard

    @smoke
    Cenario: Validar login com erro por credenciais invalidas
        Dado que estou na pagina de login
        E preencho incorretamente o campo username
        E preencho corretamente o campo password
        Quando clico em Login
        Então devo validar mensagem de erro credenciais invalidas

    @smoke
    Cenario: Validar login com erro por não preencher campo username
        Dado que estou na pagina de login
        E não preencho o campo username
        E preencho corretamente o campo password
        Quando clico em Login
        Então devo validar mensagem de erro no username required