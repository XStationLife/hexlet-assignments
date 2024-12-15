@import exercise.dto.users.UserPage
@param UserPage page

<html>
    <head>
        <meta charset="utf-8">
    </head>
    <body>
    <main>
        <p>${page.getUser().getFirstName()}</p>
        <p>${page.getUser().getLastName()}</p>
        <p>${page.getUser().getEmail()}</p>
    </main>
    </body>
</html>