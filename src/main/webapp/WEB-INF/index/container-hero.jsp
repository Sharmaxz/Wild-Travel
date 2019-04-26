<div class="container-hero">
    <div class="container-hero-img">

    </div>
</div>
<div class="user-card card">
    <h5 class="user-card-title">Faca já o seu pedido!</h5>
    <div class="user-form card-body">
        <form method="POST">
            {%  csrf_token %}
            <div class="form-row">
                <div class="form-group">
                    <label>Endereco</label>
                </div>
            </div>
            <div>
                <div>
                    <label>Check-in</label>
                </div>
            </div>
            <div>
                <div>
                    <label>Check out</label>
                </div>
            </div>
            <div>
                <div>
                    <label>Evento</label>
                    <input type="text"/>
                </div>
            </div>
            <div>
                <div>
                    <label>Preferencia de genero</label>
                    <input type="checkbox"/>
                    <input type="checkbox"/>
                </div>
            </div>
        </form>
    </div>
</div>
