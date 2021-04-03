package br.com.example.myproject.model

class InternSystem {
    fun on(admin: Authenticable, pwd: Int, auth: ()-> Unit ={}){
        if(admin.auth(pwd)){
            auth()
        }else{
            println("Falhana autentcação")
        }

    }

    fun onReceiver(admin: Authenticable, pwd: Int, auth: InternSystem.()-> Unit ={}){
        if(admin.auth(pwd)){
            auth(this)
        }else{
            println("Falhana autentcação")
        }

    }

    fun payment(){
        println("pagamento")
    }
}