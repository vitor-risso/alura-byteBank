package br.com.example.myproject.model

class InternSystem {
    fun on(admin: Authenticable, pwd: Int, auth: ()-> Unit ={}){
        if(admin.auth(pwd)){
            auth()
        }else{
            println("Falhana autentcação")
        }

    }
}