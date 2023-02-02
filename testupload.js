const form = document.forms.namedItem("fileinfo");
form.addEventListener(
  "submit",
  (event) => {
    const output = document.querySelector("#output");
    const formData = new FormData(form);

    formData.append("CustomField", "This is some extra data");
    console.log(formData.values())

    const request = new XMLHttpRequest();
    request.open("POST", "http://localhost:8080/printFile", true);
    request.onload = (progress) => {
      output.innerHTML =
        request.status === 200
          ? "Uploaded!"
          : `Error ${request.status} occurred when trying to upload your file.<br />`;
    };

    request.send(formData);
    event.preventDefault();
  },
  false
);