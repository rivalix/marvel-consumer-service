### PRUEBA TÉCNICA PARA DESARROLLADOR BACKEND SR

#### Crear una API que suministre la siguiente información de Marvel.

- [ ] ...
- [x] Mostrar listas de comic completas.
- [ ] ...

Editar clase MarvelService y colocar los datos solicitados a continuación:
```
@Service
@AllArgsConstructor
public class MarvelService {
    private static final String PUBLIC_KEY = "colar api-key publica de marvel-api aqui";
	private static final String PRIVATE_KEY = "colar api-key secreta de marvel-api aqui";

	private MarvelClient client;
```

Ejecutar proyecto y visitar el endpoint:
```
http://localhost:8080/marvel/comics
```

[Raul Portillo](https://github.com/rivalix).



