<!-- src/main/jte/layout/page.jte -->
@import gg.jte.Content
@param Content content

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="view-port" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand"  href="/">HexletUsersPage</a>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/users">Users</a>
                    </li>
                    <div class="nav-link" class="content">
                        ${content}
                    </div>
                    <footer>
                        <a class="nav-link" href="https://github.com/XStationLife">My GitHub</a>
                    </footer>
                </ul>
            </div>
    </nav>
    </header>
</body>
</html>