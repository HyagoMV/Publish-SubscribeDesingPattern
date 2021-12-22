# Publishers (Criadores)
- S�o entidade que criam/publicam um `messages`
- N�o tem conhecimento sobre os `Subscribers`
- Conhecem o `Messaging System` para publicarem as `messages`

# Subscribers (Leitores)
- S�o entidade que leem\consomem um `messages` plublicada
- N�o tem conhecimento sobre os `Publishers`
- Registram-se no `Messaging System` para consumerem as `messages` de interesse

# Messaging System (Infra.)
- Entidade que notificar� os `Subscribers` registrados que uma menssagem de interesse foi publicada por um `Publisher` 
- Atua como intermedi�rio entre `Publishers-Subscribers`

# Publish & Subscribe Pattern Vs. Observer Pattern 
- S�o `patterns` com caracteristicas semelhantes com duas diferen�as principais:
	- Primeira Diferen�a:
		- No `Observer Pattern` os `Observers` conhecem os `observables`
		- No `Publish & Subscribe Pattern` os `Publish` n�o conhecem os `Subscribe` e vice-versa
	- Segunda Defiren�a:
		- No `Observer Pattern` � implementado de forma **s�ncrona**
			- Quando ocorre um `event` o `observables` invoca o m�todo apropriado de todos os `observables`
		- No `Publish & Subscribe Pattern` � implementado de forma **ass�ncrona**