# Publishers (Criadores)
- São entidade que criam/publicam um `messages`
- Não tem conhecimento sobre os `Subscribers`
- Conhecem o `Messaging System` para publicarem as `messages`

# Subscribers (Leitores)
- São entidade que leem\consomem um `messages` plublicada
- Não tem conhecimento sobre os `Publishers`
- Registram-se no `Messaging System` para consumerem as `messages` de interesse

# Messaging System (Infra.)
- Entidade que notificará os `Subscribers` registrados que uma menssagem de interesse foi publicada por um `Publisher` 
- Atua como intermediário entre `Publishers-Subscribers`

# Publish & Subscribe Pattern Vs. Observer Pattern 
- São `patterns` com caracteristicas semelhantes com duas diferenças principais:
	- Primeira Diferença:
		- No `Observer Pattern` os `Observers` conhecem os `observables`
		- No `Publish & Subscribe Pattern` os `Publish` não conhecem os `Subscribe` e vice-versa
	- Segunda Defirença:
		- No `Observer Pattern` é implementado de forma **síncrona**
			- Quando ocorre um `event` o `observables` invoca o método apropriado de todos os `observables`
		- No `Publish & Subscribe Pattern` é implementado de forma **assíncrona**