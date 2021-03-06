class InternSystem {
    fun on(admin: Admin, pwd: Int){
        if(admin.password(pwd)){
            println("Bem vindo")
        }else{
            println("Falhana autentcação")
        }

    }
}