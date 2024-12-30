package Dominio.Produto;

public enum TipoProduto {
    ELETRONICO{
        @Override
        public double calcularDescontoProduto(double valor){
            return valor * 0.1;
        }
    },
    MOBÍLIA{
        @Override
        public double calcularDescontoProduto(double valor){
            return valor * 0.1;
        }
    },
    HIGIENE_PESSOAL{
        @Override
        public double calcularDescontoProduto(double valor){
            return valor * 0.1;
        }
    };
    public abstract double calcularDescontoProduto(double valor);
}
