@import exercise.dto.users.UsersPage
@param UsersPage page

<html>
    <head>
        <meta charset="utf-8">
    </head>
    <body>
        @if(page.getUsers().isEmpty())
            <p>Пользователей пока не добавлено</p>
        @else
            @for (var user : page.getUsers())
                <div>
                    <h2><a href="/users/${user.getId()}"></a></h2>
                    <p>${user.getFirstName()}</p>
                    <p>${user.getLastName()}</p>
                </div>
            @endfor
        @endif
    </body>
</html>