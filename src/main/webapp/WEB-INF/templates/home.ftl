<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blog Editor</title>
    <link rel="stylesheet" href="static/public/stylesheets/styles.css">
</head>
<body>
    <div class="container">
        <header>
            <p>Blog Editor</p>
        </header>
        <div class="editor-preview-wrapper">
            <!-- Editor Section -->
            <section class="editor">
                <div class="editor-header">
                    <input type="text" id="blogTitle" placeholder="Blog Title" oninput="updatePreview()">
                    <input type="text" id="blogAuthor" placeholder="Author Name" oninput="updatePreview()">
                </div>
                <div id="sectionsContainer">
                    <div class="section">
                        <textarea class="blogContent" placeholder="Enter your blog content here..." oninput="updatePreview()"></textarea>
                        <button onclick="removeSection(this)">Remove Section</button>
                    </div>
                </div>
                <button id="addSectionBtn">Add Section</button>
                <textarea id="footerContent" placeholder="Footer..." oninput="updatePreview()"></textarea>
            </section>
            <!-- Preview Section -->
            <section class="preview">
                <h2>Live Preview</h2>
                <div id="previewContent">
                    <h1 id="previewTitle"></h1>
                    <h3 id="previewAuthor"></h3>
                    <div id="previewSections"></div>
                    <footer id="previewFooter"></footer>
                </div>
            </section>
        </div>
    </div>

    <script>
        function updatePreview() {
            document.getElementById('previewTitle').innerText = document.getElementById('blogTitle').value;
            document.getElementById('previewAuthor').innerText = "By: " + document.getElementById('blogAuthor').value;

            const sectionsContainer = document.getElementById('sectionsContainer');
            const previewSections = document.getElementById('previewSections');
            previewSections.innerHTML = ""; // Clear previous sections

            Array.from(sectionsContainer.getElementsByClassName('section')).forEach(section => {
                const content = section.querySelector('.blogContent').value;
                const sectionDiv = document.createElement('div');
                sectionDiv.innerHTML = content; // Render HTML content
                previewSections.appendChild(sectionDiv);
            });

            document.getElementById('previewFooter').innerText = document.getElementById('footerContent').value;
        }

        document.getElementById('addSectionBtn').addEventListener('click', function() {
            const newSection = document.createElement('div');
            newSection.className = 'section';
            newSection.innerHTML = `
                <textarea class="blogContent" placeholder="Enter your blog content here..." oninput="updatePreview()"></textarea>
                <button onclick="removeSection(this)">Remove Section</button>
            `;
            document.getElementById('sectionsContainer').appendChild(newSection);
        });

        function removeSection(button) {
            button.parentElement.remove();
            updatePreview();
        }
    </script>
</body>
</html>

