package br.com.example.myproject.model

class InternSystem {
    fun on(admin: Authenticable, pwd: Int){
        if(admin.auth(pwd)){
            println("Bem vindo")
        }else{
            println("Falhana autentcação")
        }

    }
}