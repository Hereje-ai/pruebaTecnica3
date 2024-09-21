#autor Andres Cruz

  Feature: Seleccionar dos productos de la categoría amor

    Yo como usuario
    Quiero agregar 1 producto de la categoría Agradecimientos
    Para comprobar que se añadan al carrito de compras correctamente

    Background:
      Given "usuario" abre el sitio web de pruebas
    @successful
    Scenario: Agregar 1 productos de la categoria Agradecimientos al carro de compras
      And selecciona la categoria Agradecimientos, elige aleatoriamente el primer producto
      When regresa a la categoria Agradecimientos, elige aleatoriamente el segundo producto
      Then visualizara en el CARRITO los dos productos seleccionados