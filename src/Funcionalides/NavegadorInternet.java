 package Funcionalides;

 public interface NavegadorInternet {
        void abrirPagina(String webpage);
        void fecharPagina();
        void fazerPesquisa(String termo);
    }

    class NavegadorInternetImpl implements NavegadorInternet {
        @Override
        public void abrirPagina(String webpage) {

        }

        @Override
        public void fecharPagina() {
        }
        

        @Override
        public void fazerPesquisa(String termo) {
         
        }
    }